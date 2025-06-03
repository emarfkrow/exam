/**
 * 履歴グリッド定義
 */

let Tb3TempHisGridColumns = [];

$(function() {
    Tb3TempHisGridColumns = [
        Column.text('TEMP_ID', Messages['Tb3TempHisGrid.tempId'], 90, 'primaryKey numbering', null),
        Column.text('RIREKI_BN', Messages['Tb3TempHisGrid.rirekiBn'], 90, 'primaryKey numbering', null),
        Column.text('TEMP_INFO', Messages['Tb3TempHisGrid.tempInfo'], 300, '', null),
        Column.text('REASON', Messages['Tb3TempHisGrid.reason'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb3TempHisGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
