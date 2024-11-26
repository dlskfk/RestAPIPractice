package com.ohgiraffers.base64;

import java.util.Base64;
import java.util.Base64.*;

public class EncodingDecoding {

    public static void main(String[] args) {

        // Java v8부터 기본 제공하는 Base64 기반의 인코더와 디코더
        Encoder encoder = Base64.getEncoder();
        Decoder decoder = Base64.getDecoder();

        // 1. encoder 사용해보기
        String plainText = "집에 갈 사람";
        byte[] planTextToByteArr = plainText.getBytes();

        byte[] encodedArr = encoder.encode(planTextToByteArr);

        String encodedStr = new String(encodedArr);
        System.out.println("인코딩된 내용 = " + encodedStr);

        // 2. decoder 사용해보기
        byte[] decodedArr = decoder.decode(encodedStr);
        System.out.println("디코드된 내용 = " + new String(decodedArr));
    }
}
