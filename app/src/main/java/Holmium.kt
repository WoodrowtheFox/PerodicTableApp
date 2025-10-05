/**
 * This is for the data of Holmium
 */
class Holmium : Elements() {
    override val elementname: String?
        /**
         * This is used to get the elements name as a string
         *
         * @return - the element name
         */
        get() = "Holmium"

    override val atomicnumber: Int
        /**
         * This is used to get the atomic number of an element
         *
         * @return - the atomic number
         */
        get() = 67

    override val atomicmass: Float
        /**
         * This is used to get the atomic mass of an element
         *
         * @return - the atomic mass
         */
        get() = 164.93033f

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
        get() = 6

    override val familyname: String?
        /**
         * This is used to get the family name of an element
         *
         * @return - the family name
         */
        get() = "Lanthanide"

    /**
     * This is used to get the common uses of an element
     *
     * @return - the common uses
     */
    public override fun getcommonuses(): String? {
        return "Infrared Lasers, Laser Surgery"
    }

    /**
     * This is used to get the ionic state of the element
     *
     * @return - the ionic state
     */
    public override fun getionicstate(): Int {
        return 3
    }

    override val imagename: String?
        /**
         * This is used to get the image name of an element
         *
         * @return - the image name
         */
        get() = "Ho-base.png"

    /**
     * This is used to get how many electrons are in each shell of an element
     *
     * @return - returns a hashnmap of all the shells
     */
    public override fun getshelltotals(): HashMap<String?, Int?> {
        val myhash = HashMap<String?, Int?>()
        myhash.put("1s", 2)
        myhash.put("2s", 2)
        myhash.put("2p", 6)
        myhash.put("3s", 2)
        myhash.put("3p", 6)
        myhash.put("3d", 10)
        myhash.put("4s", 2)
        myhash.put("4p", 6)
        myhash.put("4d", 10)
        myhash.put("4f", 11)
        myhash.put("5s", 2)
        myhash.put("5p", 6)
        myhash.put("6s", 2)
        return myhash
    }
}
