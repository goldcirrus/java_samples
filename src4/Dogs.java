public class Dogs {
    /**private String name to hold dog's name*/
    private String name;

    /**private String says to hold what the dog says*/
    private String says;

    /**method getName() to return dog's name
     *@return dog's name
     */
    public String getName() {
        return name;
    }

    /**method getSays() to return what the dog says 
     *@return what the dog says*/
    public String getSays() {
        return says;
    }

    /**method setName() to assign a name to the dog
     * @param nameX is the dog's name   */
    public void setName(String nameX) {
        name=nameX;
    }

    /**method to assign what the dog says
     * @param sayX is what the dog says */
    public void setSays(String sayX) {
        says=sayX;
    }

    /**constructor to create a dog with a name
     * @param nameX is the dog's name */
    public Dogs(String nameX) {
        name=nameX;
    }
}
