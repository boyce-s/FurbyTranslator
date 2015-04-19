//
//  FRBKimonoResponse.h
//  furby-translator
//
//  Created by Harlan Kellaway on 4/18/15.
//  Copyright (c) 2015 Harlan Kellaway. All rights reserved.
//

#import <Mantle/Mantle.h>

@interface FRBKimonoResponse : MTLModel <MTLJSONSerializing>

@property(nonatomic, strong) NSDictionary *kimonoCollection;

@end
