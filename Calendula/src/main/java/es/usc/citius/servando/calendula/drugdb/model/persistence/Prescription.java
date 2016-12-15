/*
 *    Calendula - An assistant for personal medication management.
 *    Copyright (C) 2016 CITIUS - USC
 *
 *    Calendula is free software; you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation; either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this software.  If not, see <http://www.gnu.org/licenses>.
 */

package es.usc.citius.servando.calendula.drugdb.model.persistence;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import es.usc.citius.servando.calendula.util.Strings;

/**
 * This class was generated automatically.
 * Please check consistency and completion.
 * Replace {} with the appropriate classes and generate methods as needed.
 */
@DatabaseTable(tableName = "Prescription")
public class Prescription {

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_AFFECTS_DRIVING = "AffectsDriving";
    public static final String COLUMN_CODE = "Code";
    public static final String COLUMN_CONTENT = "Content";
    public static final String COLUMN_CONTENT_UNIT = "ContentUnit";
    public static final String COLUMN_DOSE = "Dose";
    public static final String COLUMN_GENERIC = "Generic";
    public static final String COLUMN_HOMOGENEOUS_GROUP = "HomogeneousGroup";
    public static final String COLUMN_NAME = "Name";
    public static final String COLUMN_PID = "PID";
    public static final String COLUMN_PACKAGE_TYPE = "PackageType";
    public static final String COLUMN_PACKAGING_UNITS = "PackagingUnits";
    public static final String COLUMN_PRESENTATION_FORM = "PresentationForm";

    /**
     * Autogenerated ID
     */
    @DatabaseField(columnName = COLUMN_ID, generatedId = true)
    private Long id;
    @DatabaseField(columnName = COLUMN_AFFECTS_DRIVING)
    private Boolean affectsDriving;
    @DatabaseField(columnName = COLUMN_CODE)
    private String code;
    @DatabaseField(columnName = COLUMN_CONTENT)
    private String content;
    @DatabaseField(columnName = COLUMN_CONTENT_UNIT)
    private Long contentUnit;
    @DatabaseField(columnName = COLUMN_DOSE)
    private String dose;
    @DatabaseField(columnName = COLUMN_GENERIC)
    private Boolean generic;
    @DatabaseField(columnName = COLUMN_HOMOGENEOUS_GROUP)
    private String homogeneousGroup;
    @DatabaseField(columnName = COLUMN_NAME)
    private String name;
    @DatabaseField(columnName = COLUMN_PID)
    private String pID;
    @DatabaseField(columnName = COLUMN_PACKAGE_TYPE)
    private String packageType;
    @DatabaseField(columnName = COLUMN_PACKAGING_UNITS)
    private Float packagingUnits;
    @DatabaseField(columnName = COLUMN_PRESENTATION_FORM)
    private String presentationForm;

    /**
     * Empty constructor, required by ORMLite
     */
    public Prescription() {
    }

    public Prescription(Boolean affectsDriving, String code, String content, Long contentUnit, String dose, Boolean generic, String homogeneousGroup, String name, String pID, String packageType, Float packagingUnits, String presentationForm) {
        this.affectsDriving = affectsDriving;
        this.code = code;
        this.content = content;
        this.contentUnit = contentUnit;
        this.dose = dose;
        this.generic = generic;
        this.homogeneousGroup = homogeneousGroup;
        this.name = name;
        this.pID = pID;
        this.packageType = packageType;
        this.packagingUnits = packagingUnits;
        this.presentationForm = presentationForm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getAffectsDriving() {
        return affectsDriving;
    }

    public void setAffectsDriving(Boolean affectsDriving) {
        this.affectsDriving = affectsDriving;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getContentUnit() {
        return contentUnit;
    }

    public void setContentUnit(Long contentUnit) {
        this.contentUnit = contentUnit;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public Boolean getGeneric() {
        return generic;
    }

    public void setGeneric(Boolean generic) {
        this.generic = generic;
    }

    public String getHomogeneousGroup() {
        return homogeneousGroup;
    }

    public void setHomogeneousGroup(String homogeneousGroup) {
        this.homogeneousGroup = homogeneousGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpID() {
        return pID;
    }

    public void setpID(String pID) {
        this.pID = pID;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public Float getPackagingUnits() {
        return packagingUnits;
    }

    public void setPackagingUnits(Float packagingUnits) {
        this.packagingUnits = packagingUnits;
    }

    public String getPresentationForm() {
        return presentationForm;
    }

    public void setPresentationForm(String presentationForm) {
        this.presentationForm = presentationForm;
    }

    public String shortName() {
        try {
            String[] parts = name.split(" ");
            String s = parts[0].toLowerCase();
            if ((s.contains("acido") || s.contains("ácido")) && parts.length > 1) {
                return Strings.toCamelCase(s + " " + parts[1], " ");
            }
            return Strings.toProperCase(s);

        } catch (Exception e) {
            return name;
        }
    }
}
