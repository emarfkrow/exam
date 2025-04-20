/**
 * 派生先１グリッド定義
 */

let Tb6HaseiSaki1GridColumns = [];

$(function() {
    Tb6HaseiSaki1GridColumns = [
        Column.text('HASEI_SAKI1_ID', Messages['Tb6HaseiSaki1Grid.haseiSaki1Id'], 90, 'primaryKey numbering', null),
        Column.text('HASEI_MOTO_ID', Messages['Tb6HaseiSaki1Grid.haseiMotoId'], 90, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb6HaseiSaki1Grid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
