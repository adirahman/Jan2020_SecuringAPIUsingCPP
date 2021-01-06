#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_arc_secureapi_MainActivity_BASEURL(JNIEnv* env,jobject /* this */) {
    std::string api_key = "https://api.learn2crack.com/android/jsonandroid/";
    return env->NewStringUTF(api_key.c_str());
}

extern "C" JNIEXPORT jstring JNICALL
Java_com_arc_secureapi_MainActivity_BASEURL2(JNIEnv* env,jobject /* this */) {
    std::string api_key = "https://api.learn2crack.com/android/jsonandroid/";
    return env->NewStringUTF(api_key.c_str());
}

extern "C" JNIEXPORT jstring JNICALL
Java_com_arc_secureapi_SecondActivity_BASEURL(JNIEnv* env,jobject /* this */){
    std::string api_key = "https://api.learn2crack.com/android/jsonandroid/";
    return env->NewStringUTF(api_key.c_str());
}