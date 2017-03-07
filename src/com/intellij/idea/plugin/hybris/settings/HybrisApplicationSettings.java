/*
 * This file is part of "hybris integration" plugin for Intellij IDEA.
 * Copyright (C) 2014-2016 Alexander Bartash <AlexanderBartash@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.intellij.idea.plugin.hybris.settings;

import com.google.common.collect.Lists;
import com.intellij.ide.util.PropertyName;
import com.intellij.idea.plugin.hybris.statistics.StatsCollector;
import com.intellij.util.containers.HashSet;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.List;

public class HybrisApplicationSettings {

    public static final List<String> DEFAULT_JUNK_FILE_NAMES = Lists.newArrayList(
        ".classpath",
        ".directory",
        ".externalToolBuilders",
        ".idea",
        ".pmd",
        ".project",
        ".ruleset",
        ".settings",
        ".springBeans",
        "beans.xsd",
        "classes",
        "eclipsebin",
        "extensioninfo.xsd",
        "items.xsd",
        "platformhome.properties",
        "ruleset.xml",
        "testclasses"
    );

    @PropertyName("foldingEnabled")
    private boolean foldingEnabled = true;

    @PropertyName("useSmartFolding")
    private boolean useSmartFolding = true;

    @PropertyName("limitedSpringConfig")
    private boolean limitedSpringConfig = true;

    @PropertyName("groupModules")
    private boolean groupModules = true;

    @PropertyName("junkDirectoryList")
    private List<String> junkDirectoryList = DEFAULT_JUNK_FILE_NAMES;

    @PropertyName("groupHybris")
    private String groupHybris = "Hybris";

    @PropertyName("groupOtherHybris")
    private String groupOtherHybris = "Hybris/Unused";

    @PropertyName("groupCustom")
    private String groupCustom = "Custom";

    @PropertyName("groupNonHybris")
    private String groupNonHybris = "Others";

    @PropertyName("groupOtherCustom")
    private String groupOtherCustom = "Custom/Unused";

    @PropertyName("groupPlatform")
    private String groupPlatform = "Platform";

    @PropertyName("hideEmptyMiddleFolders")
    private boolean hideEmptyMiddleFolders = true;

    @PropertyName("defaultPlatformInReadOnly")
    private boolean defaultPlatformInReadOnly = true;

    @PropertyName("createBackwardCyclicDependenciesForAddOns")
    private boolean createBackwardCyclicDependenciesForAddOns = false;

    @PropertyName("usedActions")
    private HashSet<StatsCollector.ACTIONS> usedActions = new HashSet<>();

    public HybrisApplicationSettings() {
    }

    public boolean isFoldingEnabled() {
        return foldingEnabled;
    }

    public void setFoldingEnabled(final boolean foldingEnabled) {
        this.foldingEnabled = foldingEnabled;
    }

    public boolean isUseSmartFolding() {
        return useSmartFolding;
    }

    public void setUseSmartFolding(final boolean foldingEnabled) {
        this.useSmartFolding = foldingEnabled;
    }

    public boolean isLimitedSpringConfig() {
        return limitedSpringConfig;
    }

    public void setLimitedSpringConfig(final boolean limitedSpringConfig) {
        this.limitedSpringConfig = limitedSpringConfig;
    }

    public List<String> getJunkDirectoryList() {
        return junkDirectoryList;
    }

    public void setJunkDirectoryList(final List<String> junkDirectoryList) {
        this.junkDirectoryList = junkDirectoryList;
    }

    public void setGroupModules(final boolean groupModules) {
        this.groupModules = groupModules;
    }

    public boolean isGroupModules() {
        return groupModules;
    }

    public String getGroupHybris() {
        return groupHybris;
    }

    public void setGroupHybris(final String groupHybris) {
        this.groupHybris = groupHybris;
    }

    public String getGroupOtherHybris() {
        return groupOtherHybris;
    }

    public void setGroupOtherHybris(final String groupOtherHybris) {
        this.groupOtherHybris = groupOtherHybris;
    }

    public String getGroupCustom() {
        return groupCustom;
    }

    public void setGroupCustom(final String groupCustom) {
        this.groupCustom = groupCustom;
    }

    public String getGroupOtherCustom() {
        return groupOtherCustom;
    }

    public void setGroupOtherCustom(final String groupOtherCustom) {
        this.groupOtherCustom = groupOtherCustom;
    }

    public String getGroupNonHybris() {
        return groupNonHybris;
    }

    public void setGroupNonHybris(final String groupNonHybris) {
        this.groupNonHybris = groupNonHybris;
    }

    public boolean isHideEmptyMiddleFolders() {
        return hideEmptyMiddleFolders;
    }

    public void setHideEmptyMiddleFolders(final boolean hideEmptyMiddleFolders) {
        this.hideEmptyMiddleFolders = hideEmptyMiddleFolders;
    }

    public boolean isDefaultPlatformInReadOnly() {
        return defaultPlatformInReadOnly;
    }

    public void setDefaultPlatformInReadOnly(final boolean defaultPlatformInReadOnly) {
        this.defaultPlatformInReadOnly = defaultPlatformInReadOnly;
    }

    public boolean isCreateBackwardCyclicDependenciesForAddOns() {
        return createBackwardCyclicDependenciesForAddOns;
    }

    public void setCreateBackwardCyclicDependenciesForAddOns(final boolean createBackwardCyclicDependenciesForAddOns) {
        this.createBackwardCyclicDependenciesForAddOns = createBackwardCyclicDependenciesForAddOns;
    }

    public String getGroupPlatform() {
        return groupPlatform;
    }

    public void setGroupPlatform(final String groupPlatform) {
        this.groupPlatform = groupPlatform;
    }

    public HashSet<StatsCollector.ACTIONS> getUsedActions() {
        return usedActions;
    }

    public void setUsedActions(final HashSet<StatsCollector.ACTIONS> usedActions) {
        this.usedActions = usedActions;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }

        if (null == obj || getClass() != obj.getClass()) {
            return false;
        }

        final HybrisApplicationSettings other = (HybrisApplicationSettings) obj;

        return new EqualsBuilder()
            .append(foldingEnabled, other.foldingEnabled)
            .append(useSmartFolding, other.useSmartFolding)
            .append(limitedSpringConfig, other.limitedSpringConfig)
            .append(groupModules, other.groupModules)
            .append(junkDirectoryList, other.junkDirectoryList)
            .append(groupHybris, other.groupHybris)
            .append(groupOtherHybris, other.groupOtherHybris)
            .append(groupCustom, other.groupCustom)
            .append(groupOtherCustom, other.groupOtherCustom)
            .append(groupNonHybris, other.groupNonHybris)
            .append(groupPlatform, other.groupPlatform)
            .append(hideEmptyMiddleFolders, other.hideEmptyMiddleFolders)
            .append(defaultPlatformInReadOnly, other.defaultPlatformInReadOnly)
            .append(createBackwardCyclicDependenciesForAddOns, other.createBackwardCyclicDependenciesForAddOns)
            .append(usedActions, other.usedActions)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(foldingEnabled)
            .append(useSmartFolding)
            .append(limitedSpringConfig)
            .append(groupModules)
            .append(junkDirectoryList)
            .append(groupHybris)
            .append(groupOtherHybris)
            .append(groupCustom)
            .append(groupOtherCustom)
            .append(groupNonHybris)
            .append(groupPlatform)
            .append(hideEmptyMiddleFolders)
            .append(defaultPlatformInReadOnly)
            .append(createBackwardCyclicDependenciesForAddOns)
            .append(usedActions)
            .toHashCode();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HybrisApplicationSettings{");
        sb.append("foldingEnabled=").append(foldingEnabled);
        sb.append(", useSmartFolding=").append(useSmartFolding);
        sb.append(", limitedSpringConfig=").append(limitedSpringConfig);
        sb.append(", groupModules=").append(groupModules);
        sb.append(", junkDirectoryList=").append(junkDirectoryList);
        sb.append(", groupHybris='").append(groupHybris).append('\'');
        sb.append(", groupOtherHybris='").append(groupOtherHybris).append('\'');
        sb.append(", groupCustom='").append(groupCustom).append('\'');
        sb.append(", groupOtherCustom='").append(groupOtherCustom).append('\'');
        sb.append(", groupNonHybris='").append(groupNonHybris).append('\'');
        sb.append(", groupPlatform='").append(groupPlatform).append('\'');
        sb.append(", hideEmptyMiddleFolders='").append(hideEmptyMiddleFolders).append('\'');
        sb.append(", defaultPlatformInReadOnly='").append(defaultPlatformInReadOnly).append('\'');
        sb.append(", createBackwardCyclicDependenciesForAddOns='").append(createBackwardCyclicDependenciesForAddOns).append('\'');
        sb.append(", usedActions='").append(usedActions).append('\'');
        sb.append('}');
        return sb.toString();
    }
}