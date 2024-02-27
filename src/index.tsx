const TestNewTurboModule = require('./NativeTestNewTurboModule').default;

export function multiply(a: number, b: number): number {
  return TestNewTurboModule.multiply(a, b);
}
