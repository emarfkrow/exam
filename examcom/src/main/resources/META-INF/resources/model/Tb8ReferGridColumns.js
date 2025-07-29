/**
 * 参照マスタグリッド定義
 */

let Tb8ReferGridColumns = [];

$(function() {
    Tb8ReferGridColumns = [
        Column.text('REFER_ID', Messages['Tb8ReferGrid.referId'], 90, 'primaryKey numbering', null),
        Column.text('REFER_MEI', Messages['Tb8ReferGrid.referMei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb8ReferGrid.updateTs'], 207, 'metaInfo optLock', Slick.Formatters.Extends.Timestamp),
    ];
});
