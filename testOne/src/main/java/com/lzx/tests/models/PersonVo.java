package com.lzx.tests.models;
import com.sun.istack.internal.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.Instant;

/**
 * @author liangzexu
 * @date 2018/6/24 下午1:59
 */
@Data
@NoArgsConstructor
public class PersonVo {

    @NonNull private String name;

    @NotNull private Integer age;

    @NonNull private Instant birthday;

}
