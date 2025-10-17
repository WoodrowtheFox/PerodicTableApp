package com.example.capstoneapplication

class Carbon : Elements() {
    override val elementname: String?
        /**
         * This is used to get the elements name as a string
         *
         * @return - the element name
         */
        get() = "com.example.capstoneapplication.Carbon"

    override val atomicnumber: Int
        /**
         * This is used to get the atomic number of an element
         *
         * @return - the atomic number
         */
        get() = 6

    override val atomicmass: Float
        /**
         * This is used to get the atomic mass of an element
         *
         * @return - the atomic mass
         */
        get() = 12.011f

    override val groupnumber: Int
        /**
         * This is used to get the group number of an element
         *
         * @return - the group number
         */
        get() = 14

    /**
     * This is used to get the number of valence elctrons
     *
     * @return - returns the number of valence electrons
     */
    public override fun getvalenceelectrons(): Int {
        return 4
    }

    override val periodnumber: Int
        /**
         * This is used to get the periodic number of an element
         *
         * @return - the periodic number
         */
        get() = 2

    override val familyname: String?
        /**
         * This is used to get the family name of an element
         *
         * @return - the family name
         */
        get() = "Nonmetal"

    /**
     * This is used to get the common uses of an element
     *
     * @return - the common uses
     */
    public override fun getcommonuses(): String? {
        return "Coal, Oil"
    }

    /**
     * This is used to get the ionic state of the element
     *
     * @return - the ionic state
     */
    public override fun getionicstate(): Int {
        return 0
    }

    override val imagename: String?
        /**
         * This is used to get the image name of an element
         *
         * @return - the image name
         */
        get() = "C-base.png"

    /**
     * This is used to get how many electrons are in each shell of an element
     *
     * @return - returns a hashnmap of all the shells
     */
    public override fun getshelltotals(): HashMap<String?, Int?> {
        val myhash = HashMap<String?, Int?>()
        myhash.put("1s", 2)
        myhash.put("2s", 2)
        myhash.put("2p", 2)
        return myhash
    }
}
