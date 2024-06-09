package com.springboot.values;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Builder             // Mapstruct를 위해 @Builder를 사용. setter는 불변 객체를 만들 수 없으므로 제외
@AllArgsConstructor  // Mapstruct는 @NoArgsConstructor와 함께 사용하면 @AllArgsConstructor가 정상 동작하지 않는다.
@NoArgsConstructor   // Spring Data는 디폴트 생성자가 필요하다.
public class Money {
    Integer value;  // 수정될 수도 있고 수정되지 않을 수도 있는 값으로 사용될 수 있기 때문에 null을 통해 판단할 수 있어야 합니다.
}
