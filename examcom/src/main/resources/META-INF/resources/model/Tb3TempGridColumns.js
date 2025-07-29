/**
 * 当初グリッド定義
 */

let Tb3TempGridColumns = [];

$(function() {
    Tb3TempGridColumns = [
        Column.text('TEMP_ID', Messages['Tb3TempGrid.tempId'], 90, 'primaryKey numbering', null),
        Column.text('TEMP_INFO', Messages['Tb3TempGrid.tempInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb3TempGrid.updateTs'], 207, 'metaInfo optLock', Slick.Formatters.Extends.Timestamp),
    ];
});
