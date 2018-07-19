package com.lzx.tests.models;
import com.sun.istack.internal.NotNull;
import lombok.*;
import lombok.experimental.Delegate;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liangzexu
 * @date 2018/6/24 下午1:59
 */
@Data
@NoArgsConstructor
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor
public class Person implements Cloneable{

    @NonNull private String name;

    @NonNull private Integer age;

     private Instant birthday;

     public  enum Type { MEAT, FISH, OTHER ;}

     @Delegate
     public List<String> address = new ArrayList<>();

    @Override
    public Object clone() {
        Person person = null;
        try{
            person = (Person)super.clone();
        }catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }
}
