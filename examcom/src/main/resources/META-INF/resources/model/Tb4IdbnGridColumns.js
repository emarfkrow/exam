/**
 * ID-BNマスタグリッド定義
 */

let Tb4IdbnGridColumns = [];

$(function() {
    Tb4IdbnGridColumns = [
        Column.refer('IDREF_ID', Messages['Tb4IdbnGrid.idrefId'], 90, 'primaryKey numbering', 'IDREF_MEI'),
        Column.text('IDBN_BN', Messages['Tb4IdbnGrid.idbnBn'], 90, 'primaryKey numbering', null),
        Column.text('IDBN_NO', Messages['Tb4IdbnGrid.idbnNo'], 90, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb4IdbnGrid.updateTs'], 207, 'metaInfo optLock', Slick.Formatters.Extends.Timestamp),
    ];
});
