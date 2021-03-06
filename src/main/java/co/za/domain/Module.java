package co.za.domain;


public class Module {

    private String moduleId;
    private String name;
    private String moduleCode;
    private Lecturer lecturer;
    private String moduleTime;
    private ModuleMaterials moduleMaterials;

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public String getModuleTime() {
        return moduleTime;
    }

    public void setModuleTime(String moduleTime) {
        this.moduleTime = moduleTime;
    }

    public ModuleMaterials getModuleMaterials() {
        return moduleMaterials;
    }

    public void setModuleMaterials(ModuleMaterials moduleMaterials) {
        this.moduleMaterials = moduleMaterials;
    }
}
