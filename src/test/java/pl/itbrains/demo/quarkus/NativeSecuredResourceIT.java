package pl.itbrains.demo.quarkus;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeSecuredResourceIT extends SecuredResourceTest {

    // Execute the same tests but in native mode.
}