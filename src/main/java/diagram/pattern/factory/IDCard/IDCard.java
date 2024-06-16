package diagram.pattern.factory.IDCard;

import diagram.pattern.factory.framework.Product;

public class IDCard extends Product {
    private String owner;

    public IDCard(String owner){
        this.owner=owner;
        System.out.printf("制作%s的校园卡\n",owner);
    }

    @Override
    public void use() {
        System.out.printf("使用%s的校园卡\n",owner);
    }

    public String getOwner() {
        return owner;
    }
}
