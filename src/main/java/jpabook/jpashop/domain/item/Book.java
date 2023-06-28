package jpabook.jpashop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")
@Getter @Setter
public class Book extends Item implements ItemInfo{

    private String Author;
    private String isbn;


    @Override
    public ItemType getType() {
        return ItemType.BOOK;
    }
}
