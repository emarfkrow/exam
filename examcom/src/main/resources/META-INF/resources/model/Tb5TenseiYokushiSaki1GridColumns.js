/**
 * 転生抑止先１グリッド定義
 */

let Tb5TenseiYokushiSaki1GridColumns = [];

$(function() {
    Tb5TenseiYokushiSaki1GridColumns = [
        Column.text('TENSEI_YOKUSHI_SAKI1_ID', Messages['Tb5TenseiYokushiSaki1Grid.tenseiYokushiSaki1Id'], 80, 'primaryKey numbering', null),
        Column.text('TENSEI_YOKUSHI_ID', Messages['Tb5TenseiYokushiSaki1Grid.tenseiYokushiId'], 80, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseiYokushiSaki1Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
