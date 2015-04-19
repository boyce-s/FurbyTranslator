//
//  FRBViewController.m
//  furby-translator
//
//  Created by Harlan Kellaway on 4/18/15.
//  Copyright (c) 2015 Harlan Kellaway. All rights reserved.
//

#import "FRBJsonParser.h"
#import "FRBWord.h"
#import "FRBViewController.h"

static NSString *const kFRBSearchNoResultsText = @"No Results";

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
  self.words = [parser wordsFromJson:@[
    @{
      @"english" : @"affirmative",
      @"furbish" : @"ee"
    },
    @{
      @"english" : @"baby",
      @"furbish" : @"bay-bee"
    }
  ]];
}

- (IBAction)search:(id)sender {
  NSString *stringToTranslate = self.searchTextField.text;

  for (FRBWord *word in self.words) {
    if ([[word.english lowercaseString]
            isEqualToString:[stringToTranslate lowercaseString]]) {
      NSLog(@"%@ = %@", stringToTranslate, word.furbish);
      self.searchResultsLabel.text = word.furbish;
      return;
    }
  }

  self.searchResultsLabel.text = kFRBSearchNoResultsText;
}

@end
