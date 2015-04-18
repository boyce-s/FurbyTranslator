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

@end

@implementation FRBViewController

- (void)viewDidLoad {
  [super viewDidLoad];

  FRBJsonParser *parser = [[FRBJsonParser alloc] init];
  NSArray *words = [parser
      wordsFromJson:@[ @{
        @"english" : @"affirmative",
        @"furbish" : @"ee"
      } ]];

  NSLog(@"words: %@", words);
}

@end
