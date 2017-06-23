
#include <stdio.h>
#include "str.h"
#include <jni.h>

JNIEXPORT jstring JNICALL Java_xunqaing_bwie_com_rk_15_ndkdemo_MainActivity_getKey
  (JNIEnv *env, jclass obj,jint str)
{
	switch (str) {
		case 1:
		//返回的字符串
			 return (*env)->NewStringUTF(env, "12345678");
			break;
		case 2:
			return (*env)->NewStringUTF(env, "00009998878");
			break;
		default:
			 return (*env)->NewStringUTF(env, "444566778");
			break;
	}

}
