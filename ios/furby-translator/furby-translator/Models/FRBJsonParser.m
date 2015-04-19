//
//  FRBJsonParser.m
//  furby-translator
//
//  Created by Harlan Kellaway on 4/18/15.
//  Copyright (c) 2015 Harlan Kellaway. All rights reserved.
//

#import "FRBJsonParser.h"
#import "FRBKimonoResponse.h"

#import <Mantle/Mantle.h>

@implementation FRBJsonParser

- (NSArray *)wordsFromJson:(id)json {

  NSError *error;
  FRBKimonoResponse *response =
      [MTLJSONAdapter modelOfClass:[FRBKimonoResponse class]
                fromJSONDictionary:json
                             error:&error];

  if (error) {
    return nil;
  }

  return response.kimonoCollection[@"collection1"];
}

@end
