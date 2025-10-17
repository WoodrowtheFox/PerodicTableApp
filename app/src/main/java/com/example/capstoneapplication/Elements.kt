package com.example.capstoneapplication

/**
 * This is the class used for all of the elements in the perodic table, and stores their data
 */
abstract class Elements {
    /**
     * This is used to get the elements name as a string
     * @return - the element name
     */
    abstract val elementname: String?

    /**
     * This is used to get the atomic number of an element
     * @return - the atomic number
     */
    abstract val atomicnumber: Int

    /**
     * This is used to get the atomic mass of an element
     * @return - the atomic mass
     */
    abstract val atomicmass: Float

    /**
     * This is used to get the group number of an element
     * @return - the group number
     */
    abstract val groupnumber: Int

    /**
     * This is used to get the number of valence elctrons
     * @return - returns the number of valence electrons
     */
    abstract fun getvalenceelectrons(): Int

    /**
     * This is used to get the periodic number of an element
     * @return - the periodic number
     */
    abstract val periodnumber: Int

    /**
     * This is used to get the family name of an element
     * @return - the family name
     */
    abstract val familyname: String?

    /**
     * This is used to get the common uses of an element
     * @return - the common uses
     */
    abstract fun getcommonuses(): String?

    /**
     * This is used to get the ionic state of the element
     * @return - the ionic state
     */
    abstract fun getionicstate(): Int

    /**
     * This is used to get the image name of an element
     * @return - the image name
     */
    abstract val imagename: String?

    /**
     * This is used to get how many electrons are in each shell of an element
     * @return - returns a hashnmap of all the shells
     */
    abstract fun getshelltotals(): HashMap<String?, Int?>?
}