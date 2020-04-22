package com.demo.composition.example3;

/*
Composition is an association represents a part of a whole relationship
where a part cannot exist without a whole.
If a whole is deleted then all parts are deleted.
It has a stronger relationship.

Key Points
It represents a part-of relationship.
In composition, both the entities are dependent on each other.
When there is a composition between two entities,
the composed object cannot exist without the other entity.
For example, if order HAS-A line-items, then an order is a whole and line items are parts
If an order is deleted then all corresponding line items for that order should be deleted.
 */
public class Dog {
    private Muzzle muzzle;

    public Muzzle getMuzzle() {
        return muzzle;
    }

    public void setMuzzle(Muzzle muzzle) {
        this.muzzle = muzzle;
    }
}
