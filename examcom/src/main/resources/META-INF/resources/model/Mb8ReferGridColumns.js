/**
 * 参照マスタグリッド定義
 */

let Mb8ReferGridColumns = [];

$(function() {
    Mb8ReferGridColumns = [
        Column.text('REFER_ID', Messages['Mb8ReferGrid.referId'], 90, 'primaryKey numbering', null),
        Column.text('REFER_MEI', Messages['Mb8ReferGrid.referMei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Mb8ReferGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
