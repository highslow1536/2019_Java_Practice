package com.company;

abstract class PairMap{
    protected String keyArray [];   // key 들을 저장하는 배열
    protected String valueArray []; // value 들을 저장하는 배열
    abstract String get(String key);    // key 값을 가진 value 리턴. 없으면 null 리턴
    abstract void put(String key, String value);    // key와 value를 쌍으로 저장. 기존에
                                                    // key가 있으면, 값을 value로 수정
    abstract String delete(String key); // key 값을 가진 아이템(value와 함께) 삭제.
                                        // 삭제된 value 값 리턴
    abstract int length();  // 현재 저장된 아이템의 개수 리턴
}

class Dictionary extends PairMap{
    private int last;   // 마지막 아이템의 인덱스
    public Dictionary(int size){
        this.keyArray = new String[size];
        this.valueArray = new String[size];
        last = -1;
    }
    @Override
    String get(String key) {    // 추상 메소드 get() 구현
        for (int i = 0; i < this.length(); i++) {
            if (keyArray[i].equals(key)) return valueArray[i];
        }
        return null;    // key 값을 가진 아이템을 못 찾은 경우 null 반환
    }
    @Override
    void put(String key, String value) {    // 추상 메소드 put() 구현
        for (int i = 0; i < this.length(); i++) {
            if (keyArray[i].equals(key)) {
                valueArray[i] = value;
                return;
            }
        }
        last++;     // 아이템 하나 추가하므로 last 값 1 증가
        keyArray[last] = key;
        valueArray[last] = value;
    }
    @Override
    String delete(String key) { // 추상 메소드 delete() 구현
        for (int i = 0; i < this.length(); i++) {
            if (keyArray[i].equals(key)) {
                String value = valueArray[i];
                for (int j = i; j < last; j++) {
                    keyArray[j] = keyArray[j+1];
                    valueArray[j] = valueArray[j+1];
                }
                last--;
                return value;
            }
        }
        return null;
    }
    @Override
    int length() {      // 추상 메소드 length() 구현
        return last+1;
    }
}

public class exam5_10 {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이선");
        dic.put("이재문", "C++");  // 이재문의 값을 C++로 수정
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");  // 황기태 아이템 삭제
        System.out.println("황기태의 값은 " + dic.get("황기태"));    // 삭제된 아이템 접근
    }
}
