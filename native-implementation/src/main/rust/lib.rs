use jni::objects::{JClass, JString};
use jni::JNIEnv;

#[no_mangle]
pub extern "system" fn Java_com_example_nativeimpl_NativeMyThing_processIntervention(
    env: JNIEnv,
    _class: JClass,
) {
    let msg = "NativeMyThing.processIntervention() has been called [Rust]";
    println!("{}", msg);
}
