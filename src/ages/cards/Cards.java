/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ages.cards;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mark
 */
@Entity
@Table(name = "CARDS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cards.findAll", query = "SELECT c FROM Cards c"),
    @NamedQuery(name = "Cards.findById", query = "SELECT c FROM Cards c WHERE c.id = :id"),
    @NamedQuery(name = "Cards.findByName", query = "SELECT c FROM Cards c WHERE c.name = :name"),
    @NamedQuery(name = "Cards.findByAge", query = "SELECT c FROM Cards c WHERE c.age = :age"),
    @NamedQuery(name = "Cards.findByBack", query = "SELECT c FROM Cards c WHERE c.back = :back"),
    @NamedQuery(name = "Cards.findByCategory", query = "SELECT c FROM Cards c WHERE c.category = :category"),
    @NamedQuery(name = "Cards.findByColor", query = "SELECT c FROM Cards c WHERE c.color = :color"),
    @NamedQuery(name = "Cards.findByUpperRight", query = "SELECT c FROM Cards c WHERE c.upperRight = :upperRight"),
    @NamedQuery(name = "Cards.findByContent", query = "SELECT c FROM Cards c WHERE c.content = :content"),
    @NamedQuery(name = "Cards.findByRemark", query = "SELECT c FROM Cards c WHERE c.remark = :remark"),
    @NamedQuery(name = "Cards.findByCnt", query = "SELECT c FROM Cards c WHERE c.cnt = :cnt")})
public class Cards implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "AGE")
    private Integer age;
    @Column(name = "BACK")
    private String back;
    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "COLOR")
    private String color;
    @Column(name = "UPPER_RIGHT")
    private String upperRight;
    @Column(name = "CONTENT")
    private String content;
    @Column(name = "REMARK")
    private String remark;
    @Basic(optional = false)
    @Column(name = "CNT")
    private int cnt;

    public Cards() {
    }

    public Cards(Integer id) {
        this.id = id;
    }

    public Cards(Integer id, int cnt) {
        this.id = id;
        this.cnt = cnt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUpperRight() {
        return upperRight;
    }

    public void setUpperRight(String upperRight) {
        this.upperRight = upperRight;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cards)) {
            return false;
        }
        Cards other = (Cards) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "[" + id + "]{"+name+"|"+age+"|"+back+"|"+category+"|"+content+"|"+upperRight+"|"+remark+"}x"+cnt;
    }
    
}
