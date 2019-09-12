package com.demo.strategy.ifElse.refactor;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author yuan
 */
public class StrategyFactory {
    private static Map<String , Strategy> strategyMap = new HashMap<>();
    static{
        strategyMap.put("i", new IdcardStrategy());
        strategyMap.put("n", new NameStrategy());
        strategyMap.put("c", new CardStrategy());
        strategyMap.put("m", new MobileStrategy());
    }
    Optional<Strategy> creator(String type){
        return Optional.ofNullable(strategyMap.get(type));
    }
}