//
//  FRBWord.h
//  furby-translator
//
//  Created by Harlan Kellaway on 4/18/15.
//  Copyright (c) 2015 Harlan Kellaway. All rights reserved.
//

#import <Mantle/Mantle.h>

@interface FRBWord : MTLModel <MTLJSONSerializing>

@property(nonatomic, copy) NSString *english;
@property(nonatomic, copy) NSString *furbish;

@end
