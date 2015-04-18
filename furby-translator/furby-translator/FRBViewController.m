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

@interface FRBViewController ()

@property(nonatomic, strong) NSArray *words;
@property(weak, nonatomic) IBOutlet UITextField *searchTextField;
@property(weak, nonatomic) IBOutlet UIButton *searchButton;

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
    if ([word.english isEqualToString:stringToTranslate]) {
      NSLog(@"%@ = %@", stringToTranslate, word.furbish);
      return;
    }
  }

  NSLog(@"Not found");
}

@end
