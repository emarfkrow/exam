/**
 * 派生先１グリッド定義
 */

let Tb6HaseiSaki1GridColumns = [];

$(function() {
    Tb6HaseiSaki1GridColumns = [
        Column.text('HASEI_SAKI1_ID', Messages['Tb6HaseiSaki1Grid.haseiSaki1Id'], 80, 'primaryKey numbering', null),
        Column.text('HASEI_MOTO_ID', Messages['Tb6HaseiSaki1Grid.haseiMotoId'], 80, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb6HaseiSaki1Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
