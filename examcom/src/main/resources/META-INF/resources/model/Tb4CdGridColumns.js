/**
 * CDマスタグリッド定義
 */

let Tb4CdGridColumns = [];

$(function() {
    Tb4CdGridColumns = [
        Column.text('CDREF_CD', Messages['Tb4CdGrid.cdrefCd'], 90, 'primaryKey', null),
        Column.text('CDREF_MEI', Messages['Tb4CdGrid.cdrefMei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb4CdGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
