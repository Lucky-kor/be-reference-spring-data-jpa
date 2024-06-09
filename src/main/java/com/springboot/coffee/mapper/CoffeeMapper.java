package com.springboot.coffee.mapper;

import com.springboot.coffee.dto.CoffeePatchDto;
import com.springboot.coffee.dto.CoffeePostDto;
import com.springboot.coffee.dto.CoffeeResponseDto;
import com.springboot.coffee.entity.Coffee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CoffeeMapper {
    Coffee coffeePostDtoToCoffee(CoffeePostDto coffeePostDto);
    Coffee coffeePatchDtoToCoffee(CoffeePatchDto coffeePatchDto);
    CoffeeResponseDto coffeeToCoffeeResponseDto(Coffee coffee);

    // Value Object를 사용하는 예제 코드
//    @Mapping(source = "price", target = "price.value")
//    Coffee coffeePostDtoToCoffee(CoffeePostDto coffeePostDto);
//
//    @Mapping(source = "price", target = "price.value")
//    Coffee coffeePatchDtoToCoffee(CoffeePatchDto coffeePatchDto);
//
//    @Mapping(source = "price.value", target = "price")
//    CoffeeResponseDto coffeeToCoffeeResponseDto(Coffee coffee);

    List<CoffeeResponseDto> coffeesToCoffeeResponseDtos(List<Coffee> coffees);
}
