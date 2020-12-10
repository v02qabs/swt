#include <stdio.h>
#include <jni.h>

JNIEXPORT void JNICALL Java_test_Hello(JNIEnv *env, jobject *obj)
{
		printf("Hello\n");
}

