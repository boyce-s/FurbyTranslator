//
//  FRBViewController.m
//  furby-translator
//
//  Created by Harlan Kellaway on 4/18/15.
//  Copyright (c) 2015 Harlan Kellaway. All rights reserved.
//

#import "FRBJsonParser.h"
#import "FRBServer.h"
#import "FRBViewController.h"

static NSString *const kFRBSearchNoResultsText = @"No Results";

#pragma mark - Requests

static NSString *const kFRBServerBaseURL = @"https://www.kimonolabs.com/api";
static NSString *const kFRBRequestApiKey = @"JtA2hZ7LabBcF5ZwPJTu06Pz21z4eqBO";
static NSString *const kFRBRequestPathAtoE = @"1ylpfuxq";

@interface FRBViewController ()

@property(nonatomic, strong) NSArray *words;
@property(weak, nonatomic) IBOutlet UITextField *searchTextField;
@property(weak, nonatomic) IBOutlet UIButton *searchButton;
@property(weak, nonatomic) IBOutlet UILabel *searchResultsLabel;

@end

@implementation FRBViewController

- (void)viewDidLoad {
  [super viewDidLoad];

  FRBJsonParser *parser = [[FRBJsonParser alloc] init];

  [FRBServer setupWithBaseUrl:kFRBServerBaseURL];
  NSDictionary *apiKeyParameter = @{ @"apikey" : kFRBRequestApiKey };
  [FRBServer GET:kFRBRequestPathAtoE
      parameters:apiKeyParameter
      completion:^(id responseObject, NSError *error) {

        NSAssert([responseObject isKindOfClass:[NSDictionary class]],
                 @"responseObject should be a dictionary");

        NSArray *wordsToAdd = [parser wordsFromJson:responseObject];
        self.words = wordsToAdd;

      }];
}

- (IBAction)search:(id)sender {
  NSString *stringToTranslate = self.searchTextField.text;

  for (NSDictionary *word in self.words) {
    if ([[word[@"english"] lowercaseString]
            isEqualToString:[stringToTranslate lowercaseString]]) {
      self.searchResultsLabel.text = word[@"furbish"];
      return;
    }
  }

  self.searchResultsLabel.text = kFRBSearchNoResultsText;
}

@end
