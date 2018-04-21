package pojo;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * 公共类
 */
@MappedSuperclass
    public class ActiveAndDisplayOrder implements Serializable {
        /**
         * 是否激活
         */
        @Column(name = "IsActive")
        private boolean isActive;
        /**
         * 显示顺序
         */
        @Column(name = "DisplayOrder")
        private int displayOrder;

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }
}
