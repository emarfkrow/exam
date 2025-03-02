/**
 * CD参照マスタグリッド定義
 */

let Mb4CdsanshoGridColumns = [];

$(function() {
    Mb4CdsanshoGridColumns = [
        Column.text('CDSANSHO_CD', Messages['Mb4CdsanshoGrid.cdsanshoCd'], 80, 'primaryKey', null),
        Column.text('CDSANSHO_MEI', Messages['Mb4CdsanshoGrid.cdsanshoMei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Mb4CdsanshoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
