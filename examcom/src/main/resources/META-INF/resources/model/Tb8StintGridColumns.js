/**
 * 制約マスタグリッド定義
 */

let Tb8StintGridColumns = [];

$(function() {
    Tb8StintGridColumns = [
        Column.text('STINT_ID', Messages['Tb8StintGrid.stintId'], 90, 'primaryKey numbering', null),
        Column.text('STINT_MEI', Messages['Tb8StintGrid.stintMei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb8StintGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
