//
//  FRBJsonParser.h
//  furby-translator
//
//  Created by Harlan Kellaway on 4/18/15.
//  Copyright (c) 2015 Harlan Kellaway. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface FRBJsonParser : NSObject

/**
 *  Returns an array of Words created from json
 *
 *  @param json json to translate into Words
 *
 *  @return Array of Words
 */
- (NSArray *)jsonToWords:(NSString *)json;

@end
