package ren.beginner.springframework.beans.factory.support;

import ren.beginner.springframework.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注册BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
