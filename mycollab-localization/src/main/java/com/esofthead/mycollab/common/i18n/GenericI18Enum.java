/**
 * This file is part of mycollab-localization.
 *
 * mycollab-localization is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-localization is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-localization.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.common.i18n;

import ch.qos.cal10n.BaseName;
import ch.qos.cal10n.Locale;
import ch.qos.cal10n.LocaleData;

@BaseName("localization/common-generic")
@LocaleData(value = {@Locale("en-US"), @Locale("ja-JP")}, defaultCharset = "UTF-8")
public enum GenericI18Enum {
    NOTIFICATION_GOTO_FIRST_RECORD,
    NOTIFICATION_GOTO_LAST_RECORD,
    NOTIFICATION_RECORD_IS_NOT_EXISTED,
    NOTIFICATION_NO_PERMISSION_DO_TASK,
    NOTIFICATION_FEATURE_NOT_AVAILABLE_IN_SUBSCRIPTION,

    WINDOW_ATTENTION_TITLE,
    WINDOW_INFORMATION_TITLE,
    WINDOW_WARNING_TITLE,
    WINDOW_ERROR_TITLE,

    BROWSER_PREVIEW_ITEM_TITLE,
    BROWSER_ADD_ITEM_TITLE,
    BROWSER_EDIT_ITEM_TITLE,

    ERROR_USER_NOTICE_INFORMATION_MESSAGE,
    ERROR_USER_INPUT_MESSAGE,
    ERROR_USER_IS_NOT_EXISTED,

    BUTTON_MORE,
    BUTTON_LESS,
    BUTTON_VIEW,
    BUTTON_SAVE,
    BUTTON_SAVE_NEW,
    BUTTON_SUBMIT,
    BUTTON_CREATE,
    BUTTON_CANCEL,
    BUTTON_DELETE,
    BUTTON_CLOSE,
    BUTTON_ASSIGN,
    BUTTON_ADD,
    BUTTON_CLONE,
    BUTTON_OPTION,
    BUTTON_REOPEN,
    BUTTON_OPEN,
    BUTTON_SELECT,
    BUTTON_NEW_FILTER,
    BUTTON_ADD_CRITERIA,
    BUTTON_YES,
    BUTTON_OK,
    BUTTON_NO,
    BUTTON_CLEAR,
    BUTTON_EDIT,
    BUTTON_ACCEPT,
    BUTTON_HISTORY,
    BUTTON_DOWNLOAD,
    BUTTON_UPLOAD,
    BUTTON_UP,
    BUTTON_MAIL,
    BUTTON_EXPORT_CSV,
    BUTTON_EXPORT_EXCEL,
    BUTTON_EXPORT_PDF,
    BUTTON_UPDATE_LABEL,
    BUTTON_SEARCH,
    BUTTON_ADVANCED_SEARCH,
    BUTTON_BASIC_SEARCH,
    BUTTON_POST,
    BUTTON_SIGNOUT,
    BUTTON_NAV_NEWER,
    BUTTON_NAV_OLDER,

    TABLE_SELECTED_ITEM_TITLE,

    DIALOG_DELETE_TITLE,
    DIALOG_DELETE_SINGLE_ITEM_MESSAGE,
    DIALOG_DELETE_MULTIPLE_ITEMS_MESSAGE,

    CONFIRM_DELETE_ATTACHMENT,
    WINDOW_MASS_UPDATE_TITLE,
    WARNING_NOT_VALID_EMAIL,

    SEARCH_MYITEMS_CHECKBOX,
    SAVE_FILTER_VALUE,
    EXCEED_BILLING_PLAN_MSG_FOR_ADMIN,
    EXCEED_BILLING_PLAN_MSG_FOR_USER,

    FORM_ASSIGNEE,
    FORM_DESCRIPTION,
    FORM_CREATED_TIME,
    FORM_LAST_UPDATED_TIME,
    FORM_LAST_ACCESSED_TIME,
    FORM_EMPTY,

    MODULE_CRM,
    MODULE_PROJECT,
    MODULE_DOCUMENT,
    MODULE_PEOPLE,

    TOOLTIP_MASS_UPDATE,
    TOOLTIP_SHOW_PREVIOUS_ITEM,
    TOOLTIP_SHOW_NEXT_ITEM,
    TOOLTIP_NO_ITEM_EXISTED,

    HELP_SPAM_FILTER_PREVENT_TITLE,
    HELP_SPAM_FILTER_PREVENT_MESSAGE,

    TAB_COMMENT,
    TAB_HISTORY,

    EXT_ADDED_COMMENT,
    EXT_NO_ITEM,

    HISTORY_FIELD,
    HISTORY_OLD_VALUE,
    HISTORY_NEW_VALUE,

    OPT_SAVED_FILTER,


    M_BUTTON_BACK,
    M_BUTTON_DONE,
    M_BUTTON_SEND,
    M_NOTE_INPUT_PROMPT,
    M_FORM_ATTACHMENT
}
