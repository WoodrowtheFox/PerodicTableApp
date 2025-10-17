package com.example.capstoneapplication

/**
 * This is for the data of com.example.capstoneapplication.Barium
 */
class Barium : Elements() {
    override val elementname: String
        /**
         * This is used to get the elements name as a string
         *
         * @return - the element name
         */
        get() = "com.example.capstoneapplication.Barium"

    override val atomicnumber: Int
        /**
         * This is used to get the atomic number of an element
         *
         * @return - the atomic number
         */
        get() = 56

    override val atomicmass: Float
        /**
         * This is used to get the atomic mass of an element
         *
         * @return - the atomic mass
         */
        get() = 137.33f

    override val groupnumber: Int
        /**
         * This is used to get the group number of an element
         *
         * @return - the group number
         */
        get() = 2

    /**
     * This is used to get the number of valence elctrons
     *
     * @return - returns the number of valence electrons
     */
    override fun getvalenceelectrons(): Int {
        return 2
    }

    override val periodnumber: Int
        /**
         * This is used to get the periodic number of an element
         *
         * @return - the periodic number
         */
        get() = 6

    override val familyname: String
        /**
         * This is used to get the family name of an element
         *
         * @return - the family name
         */
        get() = "Alkaline Earth Metal"

    /**
     * This is used to get the common uses of an element
     *
     * @return - the common uses
     */
    override fun getcommonuses(): String? {
        return "Green Fireworks"
    }

    /**
     * This is used to get the ionic state of the element
     *
     * @return - the ionic state
     */
    override fun getionicstate(): Int {
        return 2
    }

    override val imagename: String
        /**
         * This is used to get the image name of an element
         *
         * @return - the image name
         */
        get() = "Ba-base.png"

    /**
     * This is used to get how many electrons are in each shell of an element
     *
     * @return - returns a hashnmap of all the shells
     */
    override fun getshelltotals(): HashMap<String?, Int?>? {
        val myhash = HashMap<String?, Int?>()
        myhash["1s"] = 2
        myhash["2s"] = 2
        myhash["2p"] = 6
        myhash["3s"] = 2
        myhash["3p"] = 6
        myhash["3d"] = 10
        myhash["4s"] = 2
        myhash["4p"] = 6
        myhash["4d"] = 10
        myhash["5s"] = 2
        myhash["5p"] = 6
        myhash["6s"] = 2
        return myhash
    }
}
