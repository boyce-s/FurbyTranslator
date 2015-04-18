//
//  FRBJsonParser.m
//  furby-translator
//
//  Created by Harlan Kellaway on 4/18/15.
//  Copyright (c) 2015 Harlan Kellaway. All rights reserved.
//

#import "FRBJsonParser.h"
#import "FRBWord.h"

#import <Mantle/Mantle.h>

@implementation FRBJsonParser

- (NSArray *)wordsFromJson:(id)json {
  NSParameterAssert([json isKindOfClass:[NSArray class]]);

  NSError *error;
  NSArray *words = [MTLJSONAdapter modelsOfClass:[FRBWord class]
                                   fromJSONArray:json
                                           error:&error];

  if (error) {
    return nil;
  }

  return words;
}

@end
