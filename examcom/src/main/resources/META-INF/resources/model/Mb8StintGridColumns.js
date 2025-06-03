/**
 * 制約マスタグリッド定義
 */

let Mb8StintGridColumns = [];

$(function() {
    Mb8StintGridColumns = [
        Column.text('STINT_ID', Messages['Mb8StintGrid.stintId'], 90, 'primaryKey numbering', null),
        Column.text('STINT_MEI', Messages['Mb8StintGrid.stintMei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Mb8StintGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
