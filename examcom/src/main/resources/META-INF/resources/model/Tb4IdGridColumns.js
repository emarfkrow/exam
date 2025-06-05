/**
 * IDマスタグリッド定義
 */

let Tb4IdGridColumns = [];

$(function() {
    Tb4IdGridColumns = [
        Column.text('IDREF_ID', Messages['Tb4IdGrid.idrefId'], 90, 'primaryKey numbering', null),
        Column.text('IDREF_MEI', Messages['Tb4IdGrid.idrefMei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb4IdGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
