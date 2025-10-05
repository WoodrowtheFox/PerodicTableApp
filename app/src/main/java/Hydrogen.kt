/**
 * This is for the data of Hydrogen
 */
class Hydrogen : Elements() {
    override val elementname: String?
        /**
         * This is used to get the elements name as a string
         * @return - the element name
         */
        get() = "Hydrogen"
    override val atomicnumber: Int
        /**
         * This is used to get the atomic number of an element
         * @return - the atomic number
         */
        get() = 1
    override val atomicmass: Float
        /**
         * This is used to get the atomic mass of an element
         * @return - the atomic mass
         */
        get() = 1.008f
    override val groupnumber: Int
        /**
         * This is used to get the group number of an element
         * @return - the group number
         */
        get() = 1

    /**
     * This is used to get the number of valence elctrons
     *
     * @return - returns the number of valence electrons
     */
    public override fun getvalenceelectrons(): Int {
        return 1
    }

    override val periodnumber: Int
        /**
         * This is used to get the periodic number of an element
         * @return - the periodic number
         */
        get() = 1
    override val familyname: String?
        /**
         * This is used to get the family name of an element
         * @return - the family name
         */
        get() = "Reactive Non-Metal"

    /**
     * This is used to get the common uses of an element
     *
     * @return - the common uses
     */
    public override fun getcommonuses(): String? {
        return "90% of atoms in the universe"
    }

    /**
     * This is used to get the ionic state of the element
     *
     * @return - the ionic state
     */
    public override fun getionicstate(): Int {
        return 1
    }

    override val imagename: String?
        /**
         * This is used to get the image name of an element
         * @return - the image name
         */
        get() = "H-base.png"

    /**
     * This is used to get how many electrons are in each shell of an element
     *
     * @return - returns a hashnmap of all the shells
     */
    public override fun getshelltotals(): HashMap<String?, Int?> {
        val myhash = HashMap<String?, Int?>()
        myhash.put("1s", 1)
        return myhash
    }
}
