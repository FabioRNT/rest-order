package main.java.order.domain;

public interface Identifiable extends org.springframework.hateoas.Identifiable<Long> {
    public void setId(Long id);
}