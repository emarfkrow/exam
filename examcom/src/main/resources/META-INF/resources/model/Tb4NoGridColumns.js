/**
 * NOマスタグリッド定義
 */

let Tb4NoGridColumns = [];

$(function() {
    Tb4NoGridColumns = [
        Column.text('NOREF_NO', Messages['Tb4NoGrid.norefNo'], 90, 'primaryKey', null),
        Column.text('NOREF_MEI', Messages['Tb4NoGrid.norefMei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb4NoGrid.updateTs'], 207, 'metaInfo optLock', Slick.Formatters.Extends.Timestamp),
    ];
});
