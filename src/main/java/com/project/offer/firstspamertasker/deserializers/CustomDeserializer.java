package com.project.offer.firstspamertasker.deserializers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.header.Headers;
import org.springframework.kafka.support.converter.Jackson2JavaTypeMapper;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonTypeResolver;

import java.util.Map;
import java.util.function.BiFunction;

public class CustomDeserializer<T> extends JsonDeserializer<T> {

    public CustomDeserializer() {
        super();
    }

    public CustomDeserializer(ObjectMapper objectMapper) {
        super(objectMapper);
    }

    public CustomDeserializer(Class<? super T> targetType) {
        super(targetType);
    }

    public CustomDeserializer(TypeReference<? super T> targetType) {
        super(targetType);
    }

    public CustomDeserializer(Class<? super T> targetType, boolean useHeadersIfPresent) {
        super(targetType, useHeadersIfPresent);
    }

    public CustomDeserializer(TypeReference<? super T> targetType, boolean useHeadersIfPresent) {
        super(targetType, useHeadersIfPresent);
    }

    public CustomDeserializer(Class<? super T> targetType, ObjectMapper objectMapper) {
        super(targetType, objectMapper);
    }

    public CustomDeserializer(TypeReference<? super T> targetType, ObjectMapper objectMapper) {
        super(targetType, objectMapper);
    }

    public CustomDeserializer(Class<? super T> targetType, ObjectMapper objectMapper, boolean useHeadersIfPresent) {
        super(targetType, objectMapper, useHeadersIfPresent);
    }

    public CustomDeserializer(TypeReference<? super T> targetType, ObjectMapper objectMapper, boolean useHeadersIfPresent) {
        super(targetType, objectMapper, useHeadersIfPresent);
    }

    public CustomDeserializer(JavaType targetType, ObjectMapper objectMapper, boolean useHeadersIfPresent) {
        super(targetType, objectMapper, useHeadersIfPresent);
    }

    @Override
    public Jackson2JavaTypeMapper getTypeMapper() {
        return super.getTypeMapper();
    }

    @Override
    public void setTypeMapper(Jackson2JavaTypeMapper typeMapper) {
        super.setTypeMapper(typeMapper);
    }

    @Override
    public void setUseTypeMapperForKey(boolean isKey) {
        super.setUseTypeMapperForKey(isKey);
    }

    @Override
    public void setRemoveTypeHeaders(boolean removeTypeHeaders) {
        super.setRemoveTypeHeaders(removeTypeHeaders);
    }

    @Override
    public void setUseTypeHeaders(boolean useTypeHeaders) {
        super.setUseTypeHeaders(useTypeHeaders);
    }

    @Override
    public void setTypeFunction(BiFunction<byte[], Headers, JavaType> typeFunction) {
        super.setTypeFunction(typeFunction);
    }

    @Override
    public void setTypeResolver(JsonTypeResolver typeResolver) {
        super.setTypeResolver(typeResolver);
    }

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        super.configure(configs, isKey);
    }

    @Override
    public void addTrustedPackages(String... packages) {
        super.addTrustedPackages(packages);
    }

    @Override
    public T deserialize(String topic, byte[] data) {
        return super.deserialize(topic, data);
    }

    @Override
    public void close() {
        super.close();
    }

    @Override
    public JsonDeserializer<T> forKeys() {
        return super.forKeys();
    }

    @Override
    public JsonDeserializer<T> dontRemoveTypeHeaders() {
        return super.dontRemoveTypeHeaders();
    }

    @Override
    public JsonDeserializer<T> ignoreTypeHeaders() {
        return super.ignoreTypeHeaders();
    }

    @Override
    public JsonDeserializer<T> typeMapper(Jackson2JavaTypeMapper mapper) {
        return super.typeMapper(mapper);
    }

    @Override
    public JsonDeserializer<T> trustedPackages(String... packages) {
        return super.trustedPackages(packages);
    }

    @Override
    public JsonDeserializer<T> typeFunction(BiFunction<byte[], Headers, JavaType> typeFunction) {
        return super.typeFunction(typeFunction);
    }

    @Override
    public JsonDeserializer<T> typeResolver(JsonTypeResolver resolver) {
        return super.typeResolver(resolver);
    }

    @Override
    public T deserialize(String topic, Headers headers, byte[] data) {
        return super.deserialize(topic, data);
    }
}
