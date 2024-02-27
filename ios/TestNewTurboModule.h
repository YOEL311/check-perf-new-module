
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNTestNewTurboModuleSpec.h"

@interface TestNewTurboModule : NSObject <NativeTestNewTurboModuleSpec>
#else
#import <React/RCTBridgeModule.h>

@interface TestNewTurboModule : NSObject <RCTBridgeModule>
#endif

@end
