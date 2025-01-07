# Demo of a set of Maven deps that can swap a NullObject implementation for a missing JNI (rust) real impl of a thing 

This project is a Java-based application that demonstrates the use of the NullObject pattern and native implementation of a hypothetical API.

- **api**: Contains the core interfaces and classes, including the `MyThing` interface and its `NullObjectMyThing` fallback implementation.
- **native-implementation**: Contains the `NativeMyThing` implementation class of `MyThing` type, which is a native Rust implementation of the `MyThing` interface accessed via JNI.

Also important:

1. Api jar/module **does not** depend on native-implementation jar/module for compilation or execution/use in the JVM
2. native-implementation jar/module **does** depend on api jar/module for compilation and execution/use in the JVM

Prerequisites: Cargo and Maven build systems

```bash
mvn test
```

Api module's test output to console:

```
Test `com.example.api.demo.MainTest` calling `com.example.api.demo.Main` intending to call <impl of> MyThing.processIntervention():
NullObjectMyThing.processIntervention() has been called [Java]
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.739 sec
```

Classpath at the time of this test execution will be api.jar only.


NativeImpl's test output to console:

```
Test `com.example.nativeimpl.MainTest` calling `com.example.api.demo.Main` intending to call <impl of> MyThing.processIntervention():
NativeMyThing.processIntervention() has been called [Rust]
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.109 sec
```

Classpath at the time of this test execution will be api.jar **and native-implementation.jar**

That's the same main() class in the API codebase using reflection to attempt to load `NativeMyThing` in preference to `NullObjectMyThing`.  The tests are carbon copies of each other.`
